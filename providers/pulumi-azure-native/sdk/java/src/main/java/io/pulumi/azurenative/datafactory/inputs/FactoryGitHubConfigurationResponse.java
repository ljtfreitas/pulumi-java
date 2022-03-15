// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.GitHubClientSecretResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Factory's GitHub repo information.
 * 
 */
public final class FactoryGitHubConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FactoryGitHubConfigurationResponse Empty = new FactoryGitHubConfigurationResponse();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * GitHub bring your own app client id.
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * GitHub bring your own app client secret information.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable GitHubClientSecretResponse clientSecret;

    public Optional<GitHubClientSecretResponse> getClientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     * Collaboration branch.
     * 
     */
    @Import(name="collaborationBranch", required=true)
      private final String collaborationBranch;

    public String getCollaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    @Import(name="hostName")
      private final @Nullable String hostName;

    public Optional<String> getHostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    /**
     * Last commit id.
     * 
     */
    @Import(name="lastCommitId")
      private final @Nullable String lastCommitId;

    public Optional<String> getLastCommitId() {
        return this.lastCommitId == null ? Optional.empty() : Optional.ofNullable(this.lastCommitId);
    }

    /**
     * Repository name.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final String repositoryName;

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @Import(name="rootFolder", required=true)
      private final String rootFolder;

    public String getRootFolder() {
        return this.rootFolder;
    }

    /**
     * Type of repo configuration.
     * Expected value is 'FactoryGitHubConfiguration'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public FactoryGitHubConfigurationResponse(
        String accountName,
        @Nullable String clientId,
        @Nullable GitHubClientSecretResponse clientSecret,
        String collaborationBranch,
        @Nullable String hostName,
        @Nullable String lastCommitId,
        String repositoryName,
        String rootFolder,
        String type) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.collaborationBranch = Objects.requireNonNull(collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
        this.hostName = hostName;
        this.lastCommitId = lastCommitId;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.rootFolder = Objects.requireNonNull(rootFolder, "expected parameter 'rootFolder' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FactoryGitHubConfigurationResponse() {
        this.accountName = null;
        this.clientId = null;
        this.clientSecret = null;
        this.collaborationBranch = null;
        this.hostName = null;
        this.lastCommitId = null;
        this.repositoryName = null;
        this.rootFolder = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryGitHubConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable String clientId;
        private @Nullable GitHubClientSecretResponse clientSecret;
        private String collaborationBranch;
        private @Nullable String hostName;
        private @Nullable String lastCommitId;
        private String repositoryName;
        private String rootFolder;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryGitHubConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.hostName = defaults.hostName;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.type = defaults.type;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientSecret(@Nullable GitHubClientSecretResponse clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder collaborationBranch(String collaborationBranch) {
            this.collaborationBranch = Objects.requireNonNull(collaborationBranch);
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder lastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }

        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FactoryGitHubConfigurationResponse build() {
            return new FactoryGitHubConfigurationResponse(accountName, clientId, clientSecret, collaborationBranch, hostName, lastCommitId, repositoryName, rootFolder, type);
        }
    }
}
