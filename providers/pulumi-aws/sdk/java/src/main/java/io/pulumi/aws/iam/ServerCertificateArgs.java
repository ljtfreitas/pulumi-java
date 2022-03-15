// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCertificateArgs Empty = new ServerCertificateArgs();

    /**
     * The contents of the public key certificate in
     * PEM-encoded format.
     * 
     */
    @Import(name="certificateBody", required=true)
      private final Output<String> certificateBody;

    public Output<String> getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     * 
     */
    @Import(name="certificateChain")
      private final @Nullable Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain == null ? Output.empty() : this.certificateChain;
    }

    /**
     * The name of the Server Certificate. Do not include the
     * path in this value. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * The contents of the private key in PEM-encoded format.
     * 
     */
    @Import(name="privateKey", required=true)
      private final Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey;
    }

    /**
     * Map of resource tags for the server certificate. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ServerCertificateArgs(
        Output<String> certificateBody,
        @Nullable Output<String> certificateChain,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> path,
        Output<String> privateKey,
        @Nullable Output<Map<String,String>> tags) {
        this.certificateBody = Objects.requireNonNull(certificateBody, "expected parameter 'certificateBody' to be non-null");
        this.certificateChain = certificateChain;
        this.name = name;
        this.namePrefix = namePrefix;
        this.path = path;
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
        this.tags = tags;
    }

    private ServerCertificateArgs() {
        this.certificateBody = Output.empty();
        this.certificateChain = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.path = Output.empty();
        this.privateKey = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateBody;
        private @Nullable Output<String> certificateChain;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> path;
        private Output<String> privateKey;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.path = defaults.path;
    	      this.privateKey = defaults.privateKey;
    	      this.tags = defaults.tags;
        }

        public Builder certificateBody(Output<String> certificateBody) {
            this.certificateBody = Objects.requireNonNull(certificateBody);
            return this;
        }

        public Builder certificateBody(String certificateBody) {
            this.certificateBody = Output.of(Objects.requireNonNull(certificateBody));
            return this;
        }

        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        public Builder certificateChain(@Nullable String certificateChain) {
            this.certificateChain = Output.ofNullable(certificateChain);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }

        public Builder privateKey(Output<String> privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder privateKey(String privateKey) {
            this.privateKey = Output.of(Objects.requireNonNull(privateKey));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ServerCertificateArgs build() {
            return new ServerCertificateArgs(certificateBody, certificateChain, name, namePrefix, path, privateKey, tags);
        }
    }
}
