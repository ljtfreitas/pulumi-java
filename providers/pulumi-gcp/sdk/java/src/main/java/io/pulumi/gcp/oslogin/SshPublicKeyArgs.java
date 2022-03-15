// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.oslogin;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * An expiration time in microseconds since epoch.
     * 
     */
    @Import(name="expirationTimeUsec")
      private final @Nullable Output<String> expirationTimeUsec;

    public Output<String> getExpirationTimeUsec() {
        return this.expirationTimeUsec == null ? Output.empty() : this.expirationTimeUsec;
    }

    /**
     * Public key text in SSH format, defined by RFC4253 section 6.6.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * The project ID of the Google Cloud Platform project.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The user email.
     * 
     */
    @Import(name="user", required=true)
      private final Output<String> user;

    public Output<String> getUser() {
        return this.user;
    }

    public SshPublicKeyArgs(
        @Nullable Output<String> expirationTimeUsec,
        Output<String> key,
        @Nullable Output<String> project,
        Output<String> user) {
        this.expirationTimeUsec = expirationTimeUsec;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.project = project;
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private SshPublicKeyArgs() {
        this.expirationTimeUsec = Output.empty();
        this.key = Output.empty();
        this.project = Output.empty();
        this.user = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expirationTimeUsec;
        private Output<String> key;
        private @Nullable Output<String> project;
        private Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTimeUsec = defaults.expirationTimeUsec;
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.user = defaults.user;
        }

        public Builder expirationTimeUsec(@Nullable Output<String> expirationTimeUsec) {
            this.expirationTimeUsec = expirationTimeUsec;
            return this;
        }

        public Builder expirationTimeUsec(@Nullable String expirationTimeUsec) {
            this.expirationTimeUsec = Output.ofNullable(expirationTimeUsec);
            return this;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder user(Output<String> user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder user(String user) {
            this.user = Output.of(Objects.requireNonNull(user));
            return this;
        }
        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(expirationTimeUsec, key, project, user);
        }
    }
}
