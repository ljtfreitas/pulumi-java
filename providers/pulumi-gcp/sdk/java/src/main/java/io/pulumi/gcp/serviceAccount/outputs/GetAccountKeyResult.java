// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountKeyResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String keyAlgorithm;
    private final String name;
    private final @Nullable String project;
    /**
     * The public key, base64 encoded
     * 
     */
    private final String publicKey;
    private final @Nullable String publicKeyType;

    @OutputCustomType.Constructor({"id","keyAlgorithm","name","project","publicKey","publicKeyType"})
    private GetAccountKeyResult(
        String id,
        String keyAlgorithm,
        String name,
        @Nullable String project,
        String publicKey,
        @Nullable String publicKeyType) {
        this.id = Objects.requireNonNull(id);
        this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.publicKey = Objects.requireNonNull(publicKey);
        this.publicKeyType = publicKeyType;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    /**
     * The public key, base64 encoded
     * 
     */
    public String getPublicKey() {
        return this.publicKey;
    }
    public Optional<String> getPublicKeyType() {
        return Optional.ofNullable(this.publicKeyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String keyAlgorithm;
        private String name;
        private @Nullable String project;
        private String publicKey;
        private @Nullable String publicKeyType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicKey = defaults.publicKey;
    	      this.publicKeyType = defaults.publicKeyType;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setPublicKeyType(@Nullable String publicKeyType) {
            this.publicKeyType = publicKeyType;
            return this;
        }
        public GetAccountKeyResult build() {
            return new GetAccountKeyResult(id, keyAlgorithm, name, project, publicKey, publicKeyType);
        }
    }
}
