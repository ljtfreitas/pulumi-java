// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLabAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLabAccountArgs Empty = new GetLabAccountArgs();

    /**
     * Specify the $expand query. Example: 'properties($expand=sizeConfiguration)'
     * 
     */
    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab Account.
     * 
     */
    @InputImport(name="labAccountName", required=true)
    private final String labAccountName;

    public String getLabAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLabAccountArgs(
        @Nullable String expand,
        String labAccountName,
        String resourceGroupName) {
        this.expand = expand;
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLabAccountArgs() {
        this.expand = null;
        this.labAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String labAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.labAccountName = defaults.labAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setLabAccountName(String labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetLabAccountArgs build() {
            return new GetLabAccountArgs(expand, labAccountName, resourceGroupName);
        }
    }
}
