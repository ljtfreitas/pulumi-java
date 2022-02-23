// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFormulaArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFormulaArgs Empty = new GetFormulaArgs();

    /**
     * Specify the $expand query. Example: 'properties($select=description)'
     * 
     */
    @InputImport(name="expand")
        private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
        private final String labName;

    public String getLabName() {
        return this.labName;
    }

    /**
     * The name of the formula.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
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

    public GetFormulaArgs(
        @Nullable String expand,
        String labName,
        String name,
        String resourceGroupName) {
        this.expand = expand;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFormulaArgs() {
        this.expand = null;
        this.labName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFormulaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String labName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFormulaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.labName = defaults.labName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetFormulaArgs build() {
            return new GetFormulaArgs(expand, labName, name, resourceGroupName);
        }
    }
}
