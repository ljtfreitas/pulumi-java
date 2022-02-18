// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Data specific to GlusterFS.
 * 
 */
public final class GlusterFsSectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GlusterFsSectionResponse Empty = new GlusterFsSectionResponse();

    /**
     * The server address of one of the servers that hosts the GlusterFS. Can be either the IP address or server name.
     * 
     */
    @InputImport(name="serverAddress", required=true)
    private final String serverAddress;

    public String getServerAddress() {
        return this.serverAddress;
    }

    /**
     * The name of the created GlusterFS volume.
     * 
     */
    @InputImport(name="volumeName", required=true)
    private final String volumeName;

    public String getVolumeName() {
        return this.volumeName;
    }

    public GlusterFsSectionResponse(
        String serverAddress,
        String volumeName) {
        this.serverAddress = Objects.requireNonNull(serverAddress, "expected parameter 'serverAddress' to be non-null");
        this.volumeName = Objects.requireNonNull(volumeName, "expected parameter 'volumeName' to be non-null");
    }

    private GlusterFsSectionResponse() {
        this.serverAddress = null;
        this.volumeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlusterFsSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serverAddress;
        private String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GlusterFsSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverAddress = defaults.serverAddress;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setServerAddress(String serverAddress) {
            this.serverAddress = Objects.requireNonNull(serverAddress);
            return this;
        }

        public Builder setVolumeName(String volumeName) {
            this.volumeName = Objects.requireNonNull(volumeName);
            return this;
        }

        public GlusterFsSectionResponse build() {
            return new GlusterFsSectionResponse(serverAddress, volumeName);
        }
    }
}
