/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Roberto Estivill
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package intentbuilder;

import android.content.Context;
import android.os.Parcelable;
import java.util.List;

public class PreConditions {

    private PreConditions() {
    }

    public static void validateContext(Context context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(List param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(CharSequence[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(boolean[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(byte[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(char[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(double[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(float[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(int[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(long[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(short[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotEmpty(Parcelable[] param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotNull(Object param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotZero(int length, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void validateNotBlank(CharSequence param, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
