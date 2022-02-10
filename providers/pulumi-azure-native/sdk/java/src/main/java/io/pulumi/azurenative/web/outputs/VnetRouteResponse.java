// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VnetRouteResponse {
    private final @Nullable String endAddress;
    private final String id;
    private final @Nullable String kind;
    private final String name;
    private final @Nullable String routeType;
    private final @Nullable String startAddress;
    private final String type;

    @OutputCustomType.Constructor({"endAddress","id","kind","name","routeType","startAddress","type"})
    private VnetRouteResponse(
        @Nullable String endAddress,
        String id,
        @Nullable String kind,
        String name,
        @Nullable String routeType,
        @Nullable String startAddress,
        String type) {
        this.endAddress = endAddress;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.routeType = routeType;
        this.startAddress = startAddress;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEndAddress() {
        return Optional.ofNullable(this.endAddress);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getRouteType() {
        return Optional.ofNullable(this.routeType);
    }
    public Optional<String> getStartAddress() {
        return Optional.ofNullable(this.startAddress);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VnetRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endAddress;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String routeType;
        private @Nullable String startAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VnetRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endAddress = defaults.endAddress;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.routeType = defaults.routeType;
    	      this.startAddress = defaults.startAddress;
    	      this.type = defaults.type;
        }

        public Builder setEndAddress(@Nullable String endAddress) {
            this.endAddress = endAddress;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRouteType(@Nullable String routeType) {
            this.routeType = routeType;
            return this;
        }

        public Builder setStartAddress(@Nullable String startAddress) {
            this.startAddress = startAddress;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public VnetRouteResponse build() {
            return new VnetRouteResponse(endAddress, id, kind, name, routeType, startAddress, type);
        }
    }
}