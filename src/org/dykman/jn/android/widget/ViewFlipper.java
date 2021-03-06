package org.dykman.jn.android.widget;
public class ViewFlipper extends android.widget.ViewFlipper{
protected org.dykman.j.JInterface jInterface = null;
protected java.lang.String jlocale = null;
protected java.lang.String jchildid = null;
protected java.lang.String jchildidx = null;
protected java.util.ArrayList jnOverrideList = null;
protected void jparseargs (java.lang.String jlocale, java.lang.String jchildid, java.lang.String joverride ) { this.jlocale = jlocale; this.jchildid = jchildid; if (jchildid != null && jchildid.length() > 0) jchildidx = jchildid + "_"; else jchildidx = ""; if (joverride != null && joverride.length() > 0) { java.lang.String[] ss = joverride.split(" "); for (int i = 0; i < ss.length; i++) setjnOverride(ss[i]); } }
public void clearjnOverride () { jnOverrideList.clear (); }
public void setjnOverride (java.lang.String arg1 ) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); }
public void setjnOverride (java.lang.String arg1, boolean arg2 ) { if (arg2) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); } else jnOverrideList.remove (arg1); }
public boolean testjnOverride (java.lang.String arg1 ) { return jnOverrideList.contains (arg1); }
public ViewFlipper(android.content.Context arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
public ViewFlipper(android.content.Context arg1,android.util.AttributeSet arg2, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1, arg2); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override protected void onAttachedToWindow(){ if (!testjnOverride( "onAttachedToWindow" )) { super.onAttachedToWindow(); return; } jInterface.Jnido( this, jchildidx + "onAttachedToWindow_" + jlocale + "_", null ); }
@Override protected void onDetachedFromWindow(){ if (!testjnOverride( "onDetachedFromWindow" )) { super.onDetachedFromWindow(); return; } jInterface.Jnido( this, jchildidx + "onDetachedFromWindow_" + jlocale + "_", null ); }
@Override protected void onWindowVisibilityChanged(int arg1) { if (!testjnOverride( "onWindowVisibilityChanged" )) { super.onWindowVisibilityChanged( arg1); return; } jInterface.Jnido( this, jchildidx + "onWindowVisibilityChanged_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void setFlipInterval(int arg1) { if (!testjnOverride( "setFlipInterval" )) { super.setFlipInterval( arg1); return; } jInterface.Jnido( this, jchildidx + "setFlipInterval_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public void startFlipping(){ if (!testjnOverride( "startFlipping" )) { super.startFlipping(); return; } jInterface.Jnido( this, jchildidx + "startFlipping_" + jlocale + "_", null ); }
@Override public void stopFlipping(){ if (!testjnOverride( "stopFlipping" )) { super.stopFlipping(); return; } jInterface.Jnido( this, jchildidx + "stopFlipping_" + jlocale + "_", null ); }
@Override public boolean isFlipping(){ if (!testjnOverride( "isFlipping" )) return super.isFlipping(); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "isFlipping_" + jlocale + "_", null ); }
@Override public void setAutoStart(boolean arg1) { if (!testjnOverride( "setAutoStart" )) { super.setAutoStart( arg1); return; } jInterface.Jnido( this, jchildidx + "setAutoStart_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public boolean isAutoStart(){ if (!testjnOverride( "isAutoStart" )) return super.isAutoStart(); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "isAutoStart_" + jlocale + "_", null ); }
}
