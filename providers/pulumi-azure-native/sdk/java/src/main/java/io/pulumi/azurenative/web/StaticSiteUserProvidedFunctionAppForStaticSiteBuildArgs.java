// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs Empty = new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs();

    /**
     * The stage site identifier.
     * 
     */
    @Import(name="environmentName", required=true)
      private final Output<String> environmentName;

    public Output<String> getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * Name of the function app to register with the static site build.
     * 
     */
    @Import(name="functionAppName")
      private final @Nullable Output<String> functionAppName;

    public Output<String> getFunctionAppName() {
        return this.functionAppName == null ? Output.empty() : this.functionAppName;
    }

    /**
     * The region of the function app registered with the static site
     * 
     */
    @Import(name="functionAppRegion")
      private final @Nullable Output<String> functionAppRegion;

    public Output<String> getFunctionAppRegion() {
        return this.functionAppRegion == null ? Output.empty() : this.functionAppRegion;
    }

    /**
     * The resource id of the function app registered with the static site
     * 
     */
    @Import(name="functionAppResourceId")
      private final @Nullable Output<String> functionAppResourceId;

    public Output<String> getFunctionAppResourceId() {
        return this.functionAppResourceId == null ? Output.empty() : this.functionAppResourceId;
    }

    /**
     * Specify <code>true</code> to force the update of the auth configuration on the function app even if an AzureStaticWebApps provider is already configured on the function app. The default is <code>false</code>.
     * 
     */
    @Import(name="isForced")
      private final @Nullable Output<Boolean> isForced;

    public Output<Boolean> getIsForced() {
        return this.isForced == null ? Output.empty() : this.isForced;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(
        Output<String> environmentName,
        @Nullable Output<String> functionAppName,
        @Nullable Output<String> functionAppRegion,
        @Nullable Output<String> functionAppResourceId,
        @Nullable Output<Boolean> isForced,
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.functionAppName = functionAppName;
        this.functionAppRegion = functionAppRegion;
        this.functionAppResourceId = functionAppResourceId;
        this.isForced = isForced;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs() {
        this.environmentName = Output.empty();
        this.functionAppName = Output.empty();
        this.functionAppRegion = Output.empty();
        this.functionAppResourceId = Output.empty();
        this.isForced = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> environmentName;
        private @Nullable Output<String> functionAppName;
        private @Nullable Output<String> functionAppRegion;
        private @Nullable Output<String> functionAppResourceId;
        private @Nullable Output<Boolean> isForced;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.functionAppName = defaults.functionAppName;
    	      this.functionAppRegion = defaults.functionAppRegion;
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.isForced = defaults.isForced;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder environmentName(Output<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Output.of(Objects.requireNonNull(environmentName));
            return this;
        }

        public Builder functionAppName(@Nullable Output<String> functionAppName) {
            this.functionAppName = functionAppName;
            return this;
        }

        public Builder functionAppName(@Nullable String functionAppName) {
            this.functionAppName = Output.ofNullable(functionAppName);
            return this;
        }

        public Builder functionAppRegion(@Nullable Output<String> functionAppRegion) {
            this.functionAppRegion = functionAppRegion;
            return this;
        }

        public Builder functionAppRegion(@Nullable String functionAppRegion) {
            this.functionAppRegion = Output.ofNullable(functionAppRegion);
            return this;
        }

        public Builder functionAppResourceId(@Nullable Output<String> functionAppResourceId) {
            this.functionAppResourceId = functionAppResourceId;
            return this;
        }

        public Builder functionAppResourceId(@Nullable String functionAppResourceId) {
            this.functionAppResourceId = Output.ofNullable(functionAppResourceId);
            return this;
        }

        public Builder isForced(@Nullable Output<Boolean> isForced) {
            this.isForced = isForced;
            return this;
        }

        public Builder isForced(@Nullable Boolean isForced) {
            this.isForced = Output.ofNullable(isForced);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs build() {
            return new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(environmentName, functionAppName, functionAppRegion, functionAppResourceId, isForced, kind, name, resourceGroupName);
        }
    }
}
