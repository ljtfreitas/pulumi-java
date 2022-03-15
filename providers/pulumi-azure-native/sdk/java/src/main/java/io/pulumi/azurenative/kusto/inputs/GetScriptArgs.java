// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScriptArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScriptArgs Empty = new GetScriptArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Kusto database script.
     * 
     */
    @Import(name="scriptName", required=true)
      private final String scriptName;

    public String getScriptName() {
        return this.scriptName;
    }

    public GetScriptArgs(
        String clusterName,
        String databaseName,
        String resourceGroupName,
        String scriptName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scriptName = Objects.requireNonNull(scriptName, "expected parameter 'scriptName' to be non-null");
    }

    private GetScriptArgs() {
        this.clusterName = null;
        this.databaseName = null;
        this.resourceGroupName = null;
        this.scriptName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String databaseName;
        private String resourceGroupName;
        private String scriptName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.databaseName = defaults.databaseName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scriptName = defaults.scriptName;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder scriptName(String scriptName) {
            this.scriptName = Objects.requireNonNull(scriptName);
            return this;
        }
        public GetScriptArgs build() {
            return new GetScriptArgs(clusterName, databaseName, resourceGroupName, scriptName);
        }
    }
}
