// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBookmarkRelationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBookmarkRelationArgs Empty = new GetBookmarkRelationArgs();

    /**
     * Bookmark ID
     * 
     */
    @Import(name="bookmarkId", required=true)
      private final String bookmarkId;

    public String getBookmarkId() {
        return this.bookmarkId;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * Relation Name
     * 
     */
    @Import(name="relationName", required=true)
      private final String relationName;

    public String getRelationName() {
        return this.relationName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetBookmarkRelationArgs(
        String bookmarkId,
        String operationalInsightsResourceProvider,
        String relationName,
        String resourceGroupName,
        String workspaceName) {
        this.bookmarkId = Objects.requireNonNull(bookmarkId, "expected parameter 'bookmarkId' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.relationName = Objects.requireNonNull(relationName, "expected parameter 'relationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetBookmarkRelationArgs() {
        this.bookmarkId = null;
        this.operationalInsightsResourceProvider = null;
        this.relationName = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBookmarkRelationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bookmarkId;
        private String operationalInsightsResourceProvider;
        private String relationName;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBookmarkRelationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bookmarkId = defaults.bookmarkId;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.relationName = defaults.relationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder bookmarkId(String bookmarkId) {
            this.bookmarkId = Objects.requireNonNull(bookmarkId);
            return this;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder relationName(String relationName) {
            this.relationName = Objects.requireNonNull(relationName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetBookmarkRelationArgs build() {
            return new GetBookmarkRelationArgs(bookmarkId, operationalInsightsResourceProvider, relationName, resourceGroupName, workspaceName);
        }
    }
}
