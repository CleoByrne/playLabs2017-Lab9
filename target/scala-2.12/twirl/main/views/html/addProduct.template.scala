
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Add product")/*6.21*/{_display_(Seq[Any](format.raw/*6.22*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*8.6*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.107*/{_display_(Seq[Any](format.raw/*8.108*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""


    """),_display_(/*12.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.81*/("""
    """),_display_(/*13.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*13.95*/("""
    """),_display_(/*14.6*/inputText(productForm("category"), '_label -> "Category", 'class -> "form-control")),format.raw/*14.89*/("""
    """),_display_(/*15.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*15.83*/("""
    """),_display_(/*16.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*16.83*/("""
   
    """),_display_(/*18.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*18.70*/("""
    
    """),format.raw/*20.5*/("""<div class="actions">
        <inpt type="submit" vale="Add/Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.index),format.raw/*22.46*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
        </input>
    </div>


    """)))}),format.raw/*29.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 10:30:10 GMT 2017
                  SOURCE: C:/Users/User/Documents/web+mobile/WWDD1Lab9CRUD/app/views/addProduct.scala.html
                  HASH: e729d79286c693969bf467e01a87a045e3b0b84c
                  MATRIX: 967->1|1075->41|1120->36|1150->58|1180->63|1207->82|1245->83|1277->89|1346->133|1456->234|1495->235|1527->242|1539->246|1569->256|1606->267|1702->342|1735->349|1845->438|1878->445|1982->528|2015->535|2113->612|2146->619|2244->696|2282->708|2367->772|2406->784|2554->905|2569->911|2611->932|2773->1064
                  LINES: 28->1|31->3|34->1|36->4|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|41->9|41->9|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|50->18|50->18|52->20|54->22|54->22|54->22|61->29
                  -- GENERATED --
              */
          