// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An iSCSI volume from Microsoft.StoragePool provider
 * 
 */
public final class DiskPoolVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskPoolVolumeArgs Empty = new DiskPoolVolumeArgs();

    /**
     * iSCSI provider target IP address list
     * 
     */
    @InputImport(name="endpoints")
    private final @Nullable Input<List<String>> endpoints;

    public Input<List<String>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * Name of the LUN to be used
     * 
     */
    @InputImport(name="lunName")
    private final @Nullable Input<String> lunName;

    public Input<String> getLunName() {
        return this.lunName == null ? Input.empty() : this.lunName;
    }

    public DiskPoolVolumeArgs(
        @Nullable Input<List<String>> endpoints,
        @Nullable Input<String> lunName) {
        this.endpoints = endpoints;
        this.lunName = lunName;
    }

    private DiskPoolVolumeArgs() {
        this.endpoints = Input.empty();
        this.lunName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskPoolVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> endpoints;
        private @Nullable Input<String> lunName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskPoolVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.lunName = defaults.lunName;
        }

        public Builder setEndpoints(@Nullable Input<List<String>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<String> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setLunName(@Nullable Input<String> lunName) {
            this.lunName = lunName;
            return this;
        }

        public Builder setLunName(@Nullable String lunName) {
            this.lunName = Input.ofNullable(lunName);
            return this;
        }

        public DiskPoolVolumeArgs build() {
            return new DiskPoolVolumeArgs(endpoints, lunName);
        }
    }
}
