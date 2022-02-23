// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterDatabaseEncryption extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterDatabaseEncryption Empty = new GetClusterDatabaseEncryption();

    @InputImport(name="keyName", required=true)
        private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    @InputImport(name="state", required=true)
        private final String state;

    public String getState() {
        return this.state;
    }

    public GetClusterDatabaseEncryption(
        String keyName,
        String state) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private GetClusterDatabaseEncryption() {
        this.keyName = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetClusterDatabaseEncryption build() {
            return new GetClusterDatabaseEncryption(keyName, state);
        }
    }
}
