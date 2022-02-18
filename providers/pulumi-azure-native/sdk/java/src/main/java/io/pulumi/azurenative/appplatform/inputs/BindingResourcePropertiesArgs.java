// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Binding resource properties payload
 * 
 */
public final class BindingResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BindingResourcePropertiesArgs Empty = new BindingResourcePropertiesArgs();

    /**
     * Binding parameters of the Binding resource
     * 
     */
    @InputImport(name="bindingParameters")
    private final @Nullable Input<Map<String,Object>> bindingParameters;

    public Input<Map<String,Object>> getBindingParameters() {
        return this.bindingParameters == null ? Input.empty() : this.bindingParameters;
    }

    /**
     * The key of the bound resource
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * The Azure resource id of the bound resource
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public BindingResourcePropertiesArgs(
        @Nullable Input<Map<String,Object>> bindingParameters,
        @Nullable Input<String> key,
        @Nullable Input<String> resourceId) {
        this.bindingParameters = bindingParameters;
        this.key = key;
        this.resourceId = resourceId;
    }

    private BindingResourcePropertiesArgs() {
        this.bindingParameters = Input.empty();
        this.key = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BindingResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> bindingParameters;
        private @Nullable Input<String> key;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BindingResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingParameters = defaults.bindingParameters;
    	      this.key = defaults.key;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setBindingParameters(@Nullable Input<Map<String,Object>> bindingParameters) {
            this.bindingParameters = bindingParameters;
            return this;
        }

        public Builder setBindingParameters(@Nullable Map<String,Object> bindingParameters) {
            this.bindingParameters = Input.ofNullable(bindingParameters);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public BindingResourcePropertiesArgs build() {
            return new BindingResourcePropertiesArgs(bindingParameters, key, resourceId);
        }
    }
}
