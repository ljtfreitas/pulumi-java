// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationTemplateSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationTemplateSettingArgs Empty = new ConfigurationTemplateSettingArgs();

    /**
     * A unique name for this Template.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="namespace", required=true)
    private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    @InputImport(name="resource")
    private final @Nullable Input<String> resource;

    public Input<String> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ConfigurationTemplateSettingArgs(
        Input<String> name,
        Input<String> namespace,
        @Nullable Input<String> resource,
        Input<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.resource = resource;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ConfigurationTemplateSettingArgs() {
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.resource = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationTemplateSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> namespace;
        private @Nullable Input<String> resource;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationTemplateSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resource = defaults.resource;
    	      this.value = defaults.value;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNamespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public Builder setResource(@Nullable Input<String> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ConfigurationTemplateSettingArgs build() {
            return new ConfigurationTemplateSettingArgs(name, namespace, resource, value);
        }
    }
}
