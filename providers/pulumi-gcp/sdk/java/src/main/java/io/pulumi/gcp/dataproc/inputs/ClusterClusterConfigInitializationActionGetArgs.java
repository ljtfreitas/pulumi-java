// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigInitializationActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigInitializationActionGetArgs Empty = new ClusterClusterConfigInitializationActionGetArgs();

    /**
     * The script to be executed during initialization of the cluster.
     * The script must be a GCS file with a gs:// prefix.
     * 
     */
    @InputImport(name="script", required=true)
        private final Input<String> script;

    public Input<String> getScript() {
        return this.script;
    }

    /**
     * The maximum duration (in seconds) which `script` is
     * allowed to take to execute its action. GCP will default to a predetermined
     * computed value if not set (currently 300).
     * 
     */
    @InputImport(name="timeoutSec")
        private final @Nullable Input<Integer> timeoutSec;

    public Input<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Input.empty() : this.timeoutSec;
    }

    public ClusterClusterConfigInitializationActionGetArgs(
        Input<String> script,
        @Nullable Input<Integer> timeoutSec) {
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
        this.timeoutSec = timeoutSec;
    }

    private ClusterClusterConfigInitializationActionGetArgs() {
        this.script = Input.empty();
        this.timeoutSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigInitializationActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> script;
        private @Nullable Input<Integer> timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigInitializationActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.script = defaults.script;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder setScript(Input<String> script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Input.of(Objects.requireNonNull(script));
            return this;
        }

        public Builder setTimeoutSec(@Nullable Input<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }

        public Builder setTimeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Input.ofNullable(timeoutSec);
            return this;
        }
        public ClusterClusterConfigInitializationActionGetArgs build() {
            return new ClusterClusterConfigInitializationActionGetArgs(script, timeoutSec);
        }
    }
}
