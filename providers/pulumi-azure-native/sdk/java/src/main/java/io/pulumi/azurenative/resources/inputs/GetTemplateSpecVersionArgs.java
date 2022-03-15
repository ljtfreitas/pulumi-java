// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTemplateSpecVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTemplateSpecVersionArgs Empty = new GetTemplateSpecVersionArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Template Spec.
     * 
     */
    @Import(name="templateSpecName", required=true)
      private final String templateSpecName;

    public String getTemplateSpecName() {
        return this.templateSpecName;
    }

    /**
     * The version of the Template Spec.
     * 
     */
    @Import(name="templateSpecVersion", required=true)
      private final String templateSpecVersion;

    public String getTemplateSpecVersion() {
        return this.templateSpecVersion;
    }

    public GetTemplateSpecVersionArgs(
        String resourceGroupName,
        String templateSpecName,
        String templateSpecVersion) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.templateSpecName = Objects.requireNonNull(templateSpecName, "expected parameter 'templateSpecName' to be non-null");
        this.templateSpecVersion = Objects.requireNonNull(templateSpecVersion, "expected parameter 'templateSpecVersion' to be non-null");
    }

    private GetTemplateSpecVersionArgs() {
        this.resourceGroupName = null;
        this.templateSpecName = null;
        this.templateSpecVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateSpecVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String templateSpecName;
        private String templateSpecVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateSpecVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.templateSpecName = defaults.templateSpecName;
    	      this.templateSpecVersion = defaults.templateSpecVersion;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder templateSpecName(String templateSpecName) {
            this.templateSpecName = Objects.requireNonNull(templateSpecName);
            return this;
        }

        public Builder templateSpecVersion(String templateSpecVersion) {
            this.templateSpecVersion = Objects.requireNonNull(templateSpecVersion);
            return this;
        }
        public GetTemplateSpecVersionArgs build() {
            return new GetTemplateSpecVersionArgs(resourceGroupName, templateSpecName, templateSpecVersion);
        }
    }
}
