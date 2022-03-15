// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerArgs Empty = new GetServerArgs();

    /**
     * ID for an SFTP server.
     * 
     */
    @Import(name="serverId", required=true)
      private final String serverId;

    public String getServerId() {
        return this.serverId;
    }

    public GetServerArgs(String serverId) {
        this.serverId = Objects.requireNonNull(serverId, "expected parameter 'serverId' to be non-null");
    }

    private GetServerArgs() {
        this.serverId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String serverId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverId = defaults.serverId;
        }

        public Builder serverId(String serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }
        public GetServerArgs build() {
            return new GetServerArgs(serverId);
        }
    }
}
