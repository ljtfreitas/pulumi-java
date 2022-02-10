// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.inputs.TableSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceInputOutputSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceInputOutputSpecificationArgs Empty = new ServiceInputOutputSpecificationArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="properties", required=true)
    private final Input<Map<String,TableSpecificationArgs>> properties;

    public Input<Map<String,TableSpecificationArgs>> getProperties() {
        return this.properties;
    }

    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ServiceInputOutputSpecificationArgs(
        @Nullable Input<String> description,
        Input<Map<String,TableSpecificationArgs>> properties,
        @Nullable Input<String> title,
        Input<String> type) {
        this.description = description;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.title = title;
        this.type = type == null ? Input.ofNullable("object") : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceInputOutputSpecificationArgs() {
        this.description = Input.empty();
        this.properties = Input.empty();
        this.title = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInputOutputSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<Map<String,TableSpecificationArgs>> properties;
        private @Nullable Input<String> title;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInputOutputSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setProperties(Input<Map<String,TableSpecificationArgs>> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(Map<String,TableSpecificationArgs> properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
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

        public ServiceInputOutputSpecificationArgs build() {
            return new ServiceInputOutputSpecificationArgs(description, properties, title, type);
        }
    }
}