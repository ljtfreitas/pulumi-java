// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Scenario specific error details.
 * 
 */
public final class TypedErrorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final TypedErrorInfoResponse Empty = new TypedErrorInfoResponse();

    /**
     * The scenario specific error details.
     * 
     */
    @InputImport(name="info", required=true)
    private final Object info;

    public Object getInfo() {
        return this.info;
    }

    /**
     * The type of included error details.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public TypedErrorInfoResponse(
        Object info,
        String type) {
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TypedErrorInfoResponse() {
        this.info = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object info;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.info = defaults.info;
    	      this.type = defaults.type;
        }

        public Builder setInfo(Object info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public TypedErrorInfoResponse build() {
            return new TypedErrorInfoResponse(info, type);
        }
    }
}
