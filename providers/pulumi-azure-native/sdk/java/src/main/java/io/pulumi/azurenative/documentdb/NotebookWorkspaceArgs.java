// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookWorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotebookWorkspaceArgs Empty = new NotebookWorkspaceArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the notebook workspace resource.
     * 
     */
    @Import(name="notebookWorkspaceName")
      private final @Nullable Output<String> notebookWorkspaceName;

    public Output<String> getNotebookWorkspaceName() {
        return this.notebookWorkspaceName == null ? Output.empty() : this.notebookWorkspaceName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public NotebookWorkspaceArgs(
        Output<String> accountName,
        @Nullable Output<String> notebookWorkspaceName,
        Output<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.notebookWorkspaceName = notebookWorkspaceName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private NotebookWorkspaceArgs() {
        this.accountName = Output.empty();
        this.notebookWorkspaceName = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> notebookWorkspaceName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.notebookWorkspaceName = defaults.notebookWorkspaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder notebookWorkspaceName(@Nullable Output<String> notebookWorkspaceName) {
            this.notebookWorkspaceName = notebookWorkspaceName;
            return this;
        }

        public Builder notebookWorkspaceName(@Nullable String notebookWorkspaceName) {
            this.notebookWorkspaceName = Output.ofNullable(notebookWorkspaceName);
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
        public NotebookWorkspaceArgs build() {
            return new NotebookWorkspaceArgs(accountName, notebookWorkspaceName, resourceGroupName);
        }
    }
}
