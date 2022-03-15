// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.testing_v1.outputs.LauncherActivityIntentResponse;
import io.pulumi.googlenative.testing_v1.outputs.StartActivityIntentResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RoboStartingIntentResponse {
    /**
     * An intent that starts the main launcher activity.
     * 
     */
    private final LauncherActivityIntentResponse launcherActivity;
    /**
     * An intent that starts an activity with specific details.
     * 
     */
    private final StartActivityIntentResponse startActivity;
    /**
     * Timeout in seconds for each intent.
     * 
     */
    private final String timeout;

    @CustomType.Constructor
    private RoboStartingIntentResponse(
        @CustomType.Parameter("launcherActivity") LauncherActivityIntentResponse launcherActivity,
        @CustomType.Parameter("startActivity") StartActivityIntentResponse startActivity,
        @CustomType.Parameter("timeout") String timeout) {
        this.launcherActivity = launcherActivity;
        this.startActivity = startActivity;
        this.timeout = timeout;
    }

    /**
     * An intent that starts the main launcher activity.
     * 
    */
    public LauncherActivityIntentResponse getLauncherActivity() {
        return this.launcherActivity;
    }
    /**
     * An intent that starts an activity with specific details.
     * 
    */
    public StartActivityIntentResponse getStartActivity() {
        return this.startActivity;
    }
    /**
     * Timeout in seconds for each intent.
     * 
    */
    public String getTimeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoboStartingIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LauncherActivityIntentResponse launcherActivity;
        private StartActivityIntentResponse startActivity;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RoboStartingIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launcherActivity = defaults.launcherActivity;
    	      this.startActivity = defaults.startActivity;
    	      this.timeout = defaults.timeout;
        }

        public Builder launcherActivity(LauncherActivityIntentResponse launcherActivity) {
            this.launcherActivity = Objects.requireNonNull(launcherActivity);
            return this;
        }

        public Builder startActivity(StartActivityIntentResponse startActivity) {
            this.startActivity = Objects.requireNonNull(startActivity);
            return this;
        }

        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public RoboStartingIntentResponse build() {
            return new RoboStartingIntentResponse(launcherActivity, startActivity, timeout);
        }
    }
}
