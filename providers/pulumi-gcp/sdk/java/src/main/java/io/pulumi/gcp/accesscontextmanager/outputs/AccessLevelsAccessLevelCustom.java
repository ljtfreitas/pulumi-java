// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelCustomExpr;
import java.util.Objects;

@CustomType
public final class AccessLevelsAccessLevelCustom {
    /**
     * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * 
     */
    private final AccessLevelsAccessLevelCustomExpr expr;

    @CustomType.Constructor
    private AccessLevelsAccessLevelCustom(@CustomType.Parameter("expr") AccessLevelsAccessLevelCustomExpr expr) {
        this.expr = expr;
    }

    /**
     * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * 
    */
    public AccessLevelsAccessLevelCustomExpr getExpr() {
        return this.expr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelCustom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelsAccessLevelCustomExpr expr;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder expr(AccessLevelsAccessLevelCustomExpr expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }
        public AccessLevelsAccessLevelCustom build() {
            return new AccessLevelsAccessLevelCustom(expr);
        }
    }
}
