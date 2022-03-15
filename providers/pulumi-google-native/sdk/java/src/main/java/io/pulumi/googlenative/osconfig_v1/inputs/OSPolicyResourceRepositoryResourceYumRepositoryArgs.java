// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a single yum package repository. These are added to a repo file that is managed at `/etc/yum.repos.d/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceYumRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceYumRepositoryArgs Empty = new OSPolicyResourceRepositoryResourceYumRepositoryArgs();

    /**
     * The location of the repository directory.
     * 
     */
    @Import(name="baseUrl", required=true)
      private final Output<String> baseUrl;

    public Output<String> getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @Import(name="gpgKeys")
      private final @Nullable Output<List<String>> gpgKeys;

    public Output<List<String>> getGpgKeys() {
        return this.gpgKeys == null ? Output.empty() : this.gpgKeys;
    }

    /**
     * A one word, unique name for this repository. This is the `repo id` in the yum config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for resource conflicts.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public OSPolicyResourceRepositoryResourceYumRepositoryArgs(
        Output<String> baseUrl,
        @Nullable Output<String> displayName,
        @Nullable Output<List<String>> gpgKeys,
        Output<String> id) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceYumRepositoryArgs() {
        this.baseUrl = Output.empty();
        this.displayName = Output.empty();
        this.gpgKeys = Output.empty();
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceYumRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> baseUrl;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<String>> gpgKeys;
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceYumRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
    	      this.id = defaults.id;
        }

        public Builder baseUrl(Output<String> baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Output.of(Objects.requireNonNull(baseUrl));
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder gpgKeys(@Nullable Output<List<String>> gpgKeys) {
            this.gpgKeys = gpgKeys;
            return this;
        }

        public Builder gpgKeys(@Nullable List<String> gpgKeys) {
            this.gpgKeys = Output.ofNullable(gpgKeys);
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public OSPolicyResourceRepositoryResourceYumRepositoryArgs build() {
            return new OSPolicyResourceRepositoryResourceYumRepositoryArgs(baseUrl, displayName, gpgKeys, id);
        }
    }
}
