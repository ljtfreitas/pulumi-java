// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eventschemas.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistryPolicyResult {
    private final @Nullable String id;
    private final @Nullable Object policy;
    private final @Nullable String registryName;
    private final @Nullable String revisionId;

    @OutputCustomType.Constructor({"id","policy","registryName","revisionId"})
    private GetRegistryPolicyResult(
        @Nullable String id,
        @Nullable Object policy,
        @Nullable String registryName,
        @Nullable String revisionId) {
        this.id = id;
        this.policy = policy;
        this.registryName = registryName;
        this.revisionId = revisionId;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Object> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public Optional<String> getRegistryName() {
        return Optional.ofNullable(this.registryName);
    }
    public Optional<String> getRevisionId() {
        return Optional.ofNullable(this.revisionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Object policy;
        private @Nullable String registryName;
        private @Nullable String revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.policy = defaults.policy;
    	      this.registryName = defaults.registryName;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setPolicy(@Nullable Object policy) {
            this.policy = policy;
            return this;
        }

        public Builder setRegistryName(@Nullable String registryName) {
            this.registryName = registryName;
            return this;
        }

        public Builder setRevisionId(@Nullable String revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public GetRegistryPolicyResult build() {
            return new GetRegistryPolicyResult(id, policy, registryName, revisionId);
        }
    }
}