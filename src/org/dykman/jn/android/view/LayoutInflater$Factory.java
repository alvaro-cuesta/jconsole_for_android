package org.dykman.jn.android.view;
public class LayoutInflater$Factory implements android.view.LayoutInflater.Factory{
protected org.dykman.j.JInterface jInterface = null;
protected java.lang.String jlocale = null;
protected java.lang.String jchildid = null;
protected java.lang.String jchildidx = null;
protected void jparseargs (java.lang.String jlocale, java.lang.String jchildid ) { this.jlocale = jlocale; this.jchildid = jchildid; if (jchildid != null && jchildid.length() > 0) jchildidx = jchildid + "_"; else jchildidx = ""; }
public LayoutInflater$Factory (java.lang.String jlocale,java.lang.String jchildid,java.lang.String dummy ){ jparseargs( jlocale, jchildid ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; }
@Override public android.view.View onCreateView(java.lang.String arg1,android.content.Context arg2,android.util.AttributeSet arg3) { return (android.view.View) jInterface.Jnido( this, jchildidx + "onCreateView_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2, arg3 } ); }
}
