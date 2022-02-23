// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Status of Arc Extension for a particular node in HCI Cluster.
 * 
 */
public final class PerNodeExtensionStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PerNodeExtensionStateResponse Empty = new PerNodeExtensionStateResponse();

    /**
     * Fully qualified resource ID for the particular Arc Extension on this node.
     * 
     */
    @InputImport(name="extension", required=true)
        private final String extension;

    public String getExtension() {
        return this.extension;
    }

    /**
     * Name of the node in HCI Cluster.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * State of Arc Extension in this node.
     * 
     */
    @InputImport(name="state", required=true)
        private final String state;

    public String getState() {
        return this.state;
    }

    public PerNodeExtensionStateResponse(
        String extension,
        String name,
        String state) {
        this.extension = Objects.requireNonNull(extension, "expected parameter 'extension' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private PerNodeExtensionStateResponse() {
        this.extension = null;
        this.name = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerNodeExtensionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String extension;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PerNodeExtensionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extension = defaults.extension;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder setExtension(String extension) {
            this.extension = Objects.requireNonNull(extension);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public PerNodeExtensionStateResponse build() {
            return new PerNodeExtensionStateResponse(extension, name, state);
        }
    }
}
