// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TypedErrorInfoResponse {
    private final Object info;
    private final String type;

    @OutputCustomType.Constructor({"info","type"})
    private TypedErrorInfoResponse(
        Object info,
        String type) {
        this.info = Objects.requireNonNull(info);
        this.type = Objects.requireNonNull(type);
    }

    public Object getInfo() {
        return this.info;
    }
    public String getType() {
        return this.type;
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
