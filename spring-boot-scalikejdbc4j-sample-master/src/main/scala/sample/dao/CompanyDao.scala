import java.util.Optional
import org.springframework.data.domain.PageRequest
import scalikejdbc._
import scalikejdbc4j.AllJavaConverters._
import Company

object CompanyDao extends SQLSyntaxSupport[Company] {
  override def tableName = "company"

  lazy val Table = this
  lazy val c = syntax("c")

  def extract(s: SyntaxProvider[Company])(rs: WrappedResultSet): Company = extract(s.resultName)(rs)
  def extract(rn: ResultName[Company])(rs: WrappedResultSet): Company = {
    new Company(rs.get(rn.id), rs.stringOpt(rn.name).asJava)
  }
}

case class CompanyDao(implicit session: DBSession) {
  import CompanyDao._

  def create(name: Optional[String]): Company = {
    val id = withSQL {
      insert.into(Table).namedValues(
        column.name -> name.asScala)
    }.updateAndReturnGeneratedKey.apply()
    find(id).get()
  }

  def find(id: JavaLong): Optional[Company] = {
    withSQL {
      select.from(Table as c).where.eq(c.id, id)
    }.map(extract(c)).single.apply().asJava
  }

  def count(): Long = {
    withSQL {
      select(sqls.count).from(Table as c)
    }.map(_.long(1)).single.apply().get
  }

  def findAll(pr: PageRequest): JavaList[Company] = {
    withSQL {
      select.from(Table as c).limit(pr.getPageSize).offset(pr.getOffset)
    }.map(extract(c)).list.apply().asJava
  }

  def save(company: Company): Unit = {
    withSQL {
      update(Table).set(
        column.name -> company.getName.asScala).where.eq(column.id, company.getId)
    }.update.apply()
  }

  def delete(id: JavaLong): Unit = {
    withSQL {
      QueryDSL.delete.from(Table).where.eq(column.id, id)
    }.update.apply()
  }

}
