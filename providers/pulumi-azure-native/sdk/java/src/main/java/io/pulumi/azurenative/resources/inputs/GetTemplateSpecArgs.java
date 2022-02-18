// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTemplateSpecArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTemplateSpecArgs Empty = new GetTemplateSpecArgs();

    /**
     * Allows for expansion of additional Template Spec details in the response. Optional.
     * 
     */
    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Template Spec.
     * 
     */
    @InputImport(name="templateSpecName", required=true)
    private final String templateSpecName;

    public String getTemplateSpecName() {
        return this.templateSpecName;
    }

    public GetTemplateSpecArgs(
        @Nullable String expand,
        String resourceGroupName,
        String templateSpecName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.templateSpecName = Objects.requireNonNull(templateSpecName, "expected parameter 'templateSpecName' to be non-null");
    }

    private GetTemplateSpecArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.templateSpecName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String templateSpecName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.templateSpecName = defaults.templateSpecName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTemplateSpecName(String templateSpecName) {
            this.templateSpecName = Objects.requireNonNull(templateSpecName);
            return this;
        }

        public GetTemplateSpecArgs build() {
            return new GetTemplateSpecArgs(expand, resourceGroupName, templateSpecName);
        }
    }
}
