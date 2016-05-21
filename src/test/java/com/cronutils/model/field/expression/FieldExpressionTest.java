package com.cronutils.model.field.expression;

import com.cronutils.model.field.constraint.FieldConstraints;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
/*
 * Copyright 2015 jmrozanec
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class FieldExpressionTest {
    private TestFieldExpression testCronFieldExpression;

    @Before
    public void setUp() throws Exception {
        this.testCronFieldExpression = new TestFieldExpression();
    }

    @Test
    public void testAnd() throws Exception {
        FieldExpression mockExpression = mock(FieldExpression.class);
        And and = testCronFieldExpression.and(mockExpression);
        assertTrue(and.getExpressions().contains(mockExpression));
        assertTrue(and.getExpressions().contains(testCronFieldExpression));
    }

    class TestFieldExpression extends FieldExpression {

        @Override
        public String asString() {
            return "test";
        }
    }
}