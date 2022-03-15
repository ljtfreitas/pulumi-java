// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationAppSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationAppSourceArgs Empty = new ApplicationAppSourceArgs();

    /**
     * Password to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * For sources that are version-aware, the revision to use.
     * 
     */
    @Import(name="revision")
      private final @Nullable Output<String> revision;

    public Output<String> getRevision() {
        return this.revision == null ? Output.empty() : this.revision;
    }

    /**
     * SSH key to use when authenticating to the source. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="sshKey")
      private final @Nullable Output<String> sshKey;

    public Output<String> getSshKey() {
        return this.sshKey == null ? Output.empty() : this.sshKey;
    }

    /**
     * The type of source to use. For example, "archive".
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * The URL where the app resource can be found.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    /**
     * Username to use when authenticating to the source.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public ApplicationAppSourceArgs(
        @Nullable Output<String> password,
        @Nullable Output<String> revision,
        @Nullable Output<String> sshKey,
        Output<String> type,
        @Nullable Output<String> url,
        @Nullable Output<String> username) {
        this.password = password;
        this.revision = revision;
        this.sshKey = sshKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = url;
        this.username = username;
    }

    private ApplicationAppSourceArgs() {
        this.password = Output.empty();
        this.revision = Output.empty();
        this.sshKey = Output.empty();
        this.type = Output.empty();
        this.url = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private @Nullable Output<String> revision;
        private @Nullable Output<String> sshKey;
        private Output<String> type;
        private @Nullable Output<String> url;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAppSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder revision(@Nullable Output<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder revision(@Nullable String revision) {
            this.revision = Output.ofNullable(revision);
            return this;
        }

        public Builder sshKey(@Nullable Output<String> sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder sshKey(@Nullable String sshKey) {
            this.sshKey = Output.ofNullable(sshKey);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }

        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public ApplicationAppSourceArgs build() {
            return new ApplicationAppSourceArgs(password, revision, sshKey, type, url, username);
        }
    }
}
