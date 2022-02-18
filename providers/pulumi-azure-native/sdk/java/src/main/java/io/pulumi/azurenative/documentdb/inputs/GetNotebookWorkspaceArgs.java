// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNotebookWorkspaceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotebookWorkspaceArgs Empty = new GetNotebookWorkspaceArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the notebook workspace resource.
     * 
     */
    @InputImport(name="notebookWorkspaceName", required=true)
    private final String notebookWorkspaceName;

    public String getNotebookWorkspaceName() {
        return this.notebookWorkspaceName;
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

    public GetNotebookWorkspaceArgs(
        String accountName,
        String notebookWorkspaceName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.notebookWorkspaceName = Objects.requireNonNull(notebookWorkspaceName, "expected parameter 'notebookWorkspaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNotebookWorkspaceArgs() {
        this.accountName = null;
        this.notebookWorkspaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotebookWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String notebookWorkspaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotebookWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.notebookWorkspaceName = defaults.notebookWorkspaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setNotebookWorkspaceName(String notebookWorkspaceName) {
            this.notebookWorkspaceName = Objects.requireNonNull(notebookWorkspaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNotebookWorkspaceArgs build() {
            return new GetNotebookWorkspaceArgs(accountName, notebookWorkspaceName, resourceGroupName);
        }
    }
}
