// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.azurenative.cache.outputs.ModuleResponse;
import io.pulumi.azurenative.cache.outputs.PersistenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatabaseResult {
    private final @Nullable String clientProtocol;
    private final @Nullable String clusteringPolicy;
    private final @Nullable String evictionPolicy;
    private final String id;
    private final @Nullable List<ModuleResponse> modules;
    private final String name;
    private final @Nullable PersistenceResponse persistence;
    private final @Nullable Integer port;
    private final String provisioningState;
    private final String resourceState;
    private final String type;

    @OutputCustomType.Constructor({"clientProtocol","clusteringPolicy","evictionPolicy","id","modules","name","persistence","port","provisioningState","resourceState","type"})
    private GetDatabaseResult(
        @Nullable String clientProtocol,
        @Nullable String clusteringPolicy,
        @Nullable String evictionPolicy,
        String id,
        @Nullable List<ModuleResponse> modules,
        String name,
        @Nullable PersistenceResponse persistence,
        @Nullable Integer port,
        String provisioningState,
        String resourceState,
        String type) {
        this.clientProtocol = clientProtocol;
        this.clusteringPolicy = clusteringPolicy;
        this.evictionPolicy = evictionPolicy;
        this.id = Objects.requireNonNull(id);
        this.modules = modules;
        this.name = Objects.requireNonNull(name);
        this.persistence = persistence;
        this.port = port;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getClientProtocol() {
        return Optional.ofNullable(this.clientProtocol);
    }
    public Optional<String> getClusteringPolicy() {
        return Optional.ofNullable(this.clusteringPolicy);
    }
    public Optional<String> getEvictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }
    public String getId() {
        return this.id;
    }
    public List<ModuleResponse> getModules() {
        return this.modules == null ? List.of() : this.modules;
    }
    public String getName() {
        return this.name;
    }
    public Optional<PersistenceResponse> getPersistence() {
        return Optional.ofNullable(this.persistence);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceState() {
        return this.resourceState;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientProtocol;
        private @Nullable String clusteringPolicy;
        private @Nullable String evictionPolicy;
        private String id;
        private @Nullable List<ModuleResponse> modules;
        private String name;
        private @Nullable PersistenceResponse persistence;
        private @Nullable Integer port;
        private String provisioningState;
        private String resourceState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientProtocol = defaults.clientProtocol;
    	      this.clusteringPolicy = defaults.clusteringPolicy;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.id = defaults.id;
    	      this.modules = defaults.modules;
    	      this.name = defaults.name;
    	      this.persistence = defaults.persistence;
    	      this.port = defaults.port;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.type = defaults.type;
        }

        public Builder setClientProtocol(@Nullable String clientProtocol) {
            this.clientProtocol = clientProtocol;
            return this;
        }

        public Builder setClusteringPolicy(@Nullable String clusteringPolicy) {
            this.clusteringPolicy = clusteringPolicy;
            return this;
        }

        public Builder setEvictionPolicy(@Nullable String evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setModules(@Nullable List<ModuleResponse> modules) {
            this.modules = modules;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPersistence(@Nullable PersistenceResponse persistence) {
            this.persistence = persistence;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDatabaseResult build() {
            return new GetDatabaseResult(clientProtocol, clusteringPolicy, evictionPolicy, id, modules, name, persistence, port, provisioningState, resourceState, type);
        }
    }
}