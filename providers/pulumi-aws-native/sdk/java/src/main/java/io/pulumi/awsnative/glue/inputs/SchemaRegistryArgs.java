// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifier for the registry which the schema is part of.
 * 
 */
public final class SchemaRegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryArgs Empty = new SchemaRegistryArgs();

    /**
     * Amazon Resource Name for the Registry.
     * 
     */
    @InputImport(name="arn")
        private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Name of the registry in which the schema will be created.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SchemaRegistryArgs(
        @Nullable Input<String> arn,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.name = name;
    }

    private SchemaRegistryArgs() {
        this.arn = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public SchemaRegistryArgs build() {
            return new SchemaRegistryArgs(arn, name);
        }
    }
}
