package com.jax.scala.tools

import java.util.Optional
import scalikejdbc._
import scalikejdbc4j.AllJavaConverters._
import com.jax.scala.tools.Company;

/**
  * Created by Jax on 2016/10/22.
  */
object CompanyDao extends SQLSyntaxSupport[Company]{
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

  def create(name: Optional[String]): JavaLong = {
    withSQL { insert.into(Table).namedValues(column.name -> name.asScala) }
      .updateAndReturnGeneratedKey.apply()
  }

  def find(id: JavaLong): Optional[Company] = {
    withSQL { select.from(Table as c).where.eq(c.id, id) }.map(extract(c)).single.apply().asJava
  }

  def findAll(): JavaList[Company] = {
    withSQL { select.from(Table as c) }.map(extract(c)).list.apply().asJava
  }
}
