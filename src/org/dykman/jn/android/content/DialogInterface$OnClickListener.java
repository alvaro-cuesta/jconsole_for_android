package org.dykman.jn.android.content;
public class DialogInterface$OnClickListener implements android.content.DialogInterface.OnClickListener{
protected org.dykman.j.JInterface jInterface = null;
protected java.lang.String jlocale = null;
protected java.lang.String jchildid = null;
protected java.lang.String jchildidx = null;
protected void jparseargs (java.lang.String jlocale, java.lang.String jchildid ) { this.jlocale = jlocale; this.jchildid = jchildid; if (jchildid != null && jchildid.length() > 0) jchildidx = jchildid + "_"; else jchildidx = ""; }
public DialogInterface$OnClickListener (java.lang.String jlocale,java.lang.String jchildid,java.lang.String dummy ){ jparseargs( jlocale, jchildid ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; }
@Override public void onClick(android.content.DialogInterface arg1,int arg2) { jInterface.Jnido( this, jchildidx + "onClick_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
}
