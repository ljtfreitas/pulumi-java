// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TableAttributeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableAttributeGetArgs Empty = new TableAttributeGetArgs();

    /**
     * The name of the index
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TableAttributeGetArgs(
        Input<String> name,
        Input<String> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TableAttributeGetArgs() {
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableAttributeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableAttributeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TableAttributeGetArgs build() {
            return new TableAttributeGetArgs(name, type);
        }
    }
}
