//License
/*
Copyright (C) 2013 Jordon Smith

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
associated documentation files (the "Software"), to deal in the Software without restriction,
including without limitation the rights to use, copy, modify, merge, publish, distribute,
sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or
substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Any other code was used from the Android Development Docs, which are open-source.
 */

package com.greenteam.cs3398project;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        One way to use the calendar widget is putting it in the xml file is shown in main.xml
//        setContentView(R.layout.main);

        /*
         Other way is to add is using the java code as follows.
		*/
        MonthView mv = new MonthView(this);
        setContentView(mv);
//        Calendar cal = Calendar.getInstance();
//        cal.set(2012, Calendar.DECEMBER,12);
//        mv.GoToDate(cal.getTime());
    }
}