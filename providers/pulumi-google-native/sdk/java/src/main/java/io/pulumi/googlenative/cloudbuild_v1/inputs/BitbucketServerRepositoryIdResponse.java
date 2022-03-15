// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * BitbucketServerRepositoryId identifies a specific repository hosted on a Bitbucket Server.
 * 
 */
public final class BitbucketServerRepositoryIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final BitbucketServerRepositoryIdResponse Empty = new BitbucketServerRepositoryIdResponse();

    /**
     * Identifier for the project storing the repository.
     * 
     */
    @Import(name="projectKey", required=true)
      private final String projectKey;

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     * Identifier for the repository.
     * 
     */
    @Import(name="repoSlug", required=true)
      private final String repoSlug;

    public String getRepoSlug() {
        return this.repoSlug;
    }

    /**
     * The ID of the webhook that was created for receiving events from this repo. We only create and manage a single webhook for each repo.
     * 
     */
    @Import(name="webhookId", required=true)
      private final Integer webhookId;

    public Integer getWebhookId() {
        return this.webhookId;
    }

    public BitbucketServerRepositoryIdResponse(
        String projectKey,
        String repoSlug,
        Integer webhookId) {
        this.projectKey = Objects.requireNonNull(projectKey, "expected parameter 'projectKey' to be non-null");
        this.repoSlug = Objects.requireNonNull(repoSlug, "expected parameter 'repoSlug' to be non-null");
        this.webhookId = Objects.requireNonNull(webhookId, "expected parameter 'webhookId' to be non-null");
    }

    private BitbucketServerRepositoryIdResponse() {
        this.projectKey = null;
        this.repoSlug = null;
        this.webhookId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerRepositoryIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectKey;
        private String repoSlug;
        private Integer webhookId;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerRepositoryIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectKey = defaults.projectKey;
    	      this.repoSlug = defaults.repoSlug;
    	      this.webhookId = defaults.webhookId;
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = Objects.requireNonNull(projectKey);
            return this;
        }

        public Builder repoSlug(String repoSlug) {
            this.repoSlug = Objects.requireNonNull(repoSlug);
            return this;
        }

        public Builder webhookId(Integer webhookId) {
            this.webhookId = Objects.requireNonNull(webhookId);
            return this;
        }
        public BitbucketServerRepositoryIdResponse build() {
            return new BitbucketServerRepositoryIdResponse(projectKey, repoSlug, webhookId);
        }
    }
}
