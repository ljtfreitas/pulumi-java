// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.AzureFileVolumeResponse;
import io.pulumi.azurenative.containerinstance.outputs.GitRepoVolumeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeResponse {
    /**
     * The Azure File volume.
     * 
     */
    private final @Nullable AzureFileVolumeResponse azureFile;
    /**
     * The empty directory volume.
     * 
     */
    private final @Nullable Object emptyDir;
    /**
     * The git repo volume.
     * 
     */
    private final @Nullable GitRepoVolumeResponse gitRepo;
    /**
     * The name of the volume.
     * 
     */
    private final String name;
    /**
     * The secret volume.
     * 
     */
    private final @Nullable Map<String,String> secret;

    @CustomType.Constructor
    private VolumeResponse(
        @CustomType.Parameter("azureFile") @Nullable AzureFileVolumeResponse azureFile,
        @CustomType.Parameter("emptyDir") @Nullable Object emptyDir,
        @CustomType.Parameter("gitRepo") @Nullable GitRepoVolumeResponse gitRepo,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secret") @Nullable Map<String,String> secret) {
        this.azureFile = azureFile;
        this.emptyDir = emptyDir;
        this.gitRepo = gitRepo;
        this.name = name;
        this.secret = secret;
    }

    /**
     * The Azure File volume.
     * 
    */
    public Optional<AzureFileVolumeResponse> getAzureFile() {
        return Optional.ofNullable(this.azureFile);
    }
    /**
     * The empty directory volume.
     * 
    */
    public Optional<Object> getEmptyDir() {
        return Optional.ofNullable(this.emptyDir);
    }
    /**
     * The git repo volume.
     * 
    */
    public Optional<GitRepoVolumeResponse> getGitRepo() {
        return Optional.ofNullable(this.gitRepo);
    }
    /**
     * The name of the volume.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The secret volume.
     * 
    */
    public Map<String,String> getSecret() {
        return this.secret == null ? Map.of() : this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFileVolumeResponse azureFile;
        private @Nullable Object emptyDir;
        private @Nullable GitRepoVolumeResponse gitRepo;
        private String name;
        private @Nullable Map<String,String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFile = defaults.azureFile;
    	      this.emptyDir = defaults.emptyDir;
    	      this.gitRepo = defaults.gitRepo;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder azureFile(@Nullable AzureFileVolumeResponse azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        public Builder emptyDir(@Nullable Object emptyDir) {
            this.emptyDir = emptyDir;
            return this;
        }

        public Builder gitRepo(@Nullable GitRepoVolumeResponse gitRepo) {
            this.gitRepo = gitRepo;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder secret(@Nullable Map<String,String> secret) {
            this.secret = secret;
            return this;
        }
        public VolumeResponse build() {
            return new VolumeResponse(azureFile, emptyDir, gitRepo, name, secret);
        }
    }
}
