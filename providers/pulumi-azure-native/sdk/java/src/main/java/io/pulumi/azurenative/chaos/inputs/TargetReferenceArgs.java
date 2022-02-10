// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.enums.TargetReferenceType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TargetReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetReferenceArgs Empty = new TargetReferenceArgs();

    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    @InputImport(name="type", required=true)
    private final Input<TargetReferenceType> type;

    public Input<TargetReferenceType> getType() {
        return this.type;
    }

    public TargetReferenceArgs(
        Input<String> id,
        Input<TargetReferenceType> type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TargetReferenceArgs() {
        this.id = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private Input<TargetReferenceType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setType(Input<TargetReferenceType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(TargetReferenceType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public TargetReferenceArgs build() {
            return new TargetReferenceArgs(id, type);
        }
    }
}