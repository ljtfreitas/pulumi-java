// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs();

    /**
     * SHA256 checksum of the remote file.
     * 
     */
    @Import(name="sha256Checksum")
      private final @Nullable Output<String> sha256Checksum;

    public Output<String> getSha256Checksum() {
        return this.sha256Checksum == null ? Output.empty() : this.sha256Checksum;
    }

    /**
     * Required. URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs(
        @Nullable Output<String> sha256Checksum,
        Output<String> uri) {
        this.sha256Checksum = sha256Checksum;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs() {
        this.sha256Checksum = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sha256Checksum;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder sha256Checksum(@Nullable Output<String> sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder sha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = Output.ofNullable(sha256Checksum);
            return this;
        }

        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs(sha256Checksum, uri);
        }
    }
}
