// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TypedErrorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypedErrorInfoArgs Empty = new TypedErrorInfoArgs();

    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TypedErrorInfoArgs(Input<String> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TypedErrorInfoArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedErrorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedErrorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TypedErrorInfoArgs build() {
            return new TypedErrorInfoArgs(type);
        }
    }
}
