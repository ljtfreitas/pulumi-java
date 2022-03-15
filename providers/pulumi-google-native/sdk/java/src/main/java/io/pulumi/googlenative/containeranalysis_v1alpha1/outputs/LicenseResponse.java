// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LicenseResponse {
    /**
     * Comments
     * 
     */
    private final String comments;
    /**
     * Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
     */
    private final String expression;

    @CustomType.Constructor
    private LicenseResponse(
        @CustomType.Parameter("comments") String comments,
        @CustomType.Parameter("expression") String expression) {
        this.comments = comments;
        this.expression = expression;
    }

    /**
     * Comments
     * 
    */
    public String getComments() {
        return this.comments;
    }
    /**
     * Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
    */
    public String getExpression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comments;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.expression = defaults.expression;
        }

        public Builder comments(String comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public LicenseResponse build() {
            return new LicenseResponse(comments, expression);
        }
    }
}
