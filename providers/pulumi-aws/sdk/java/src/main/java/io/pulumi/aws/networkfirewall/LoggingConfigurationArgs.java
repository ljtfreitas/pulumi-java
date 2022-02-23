// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall;

import io.pulumi.aws.networkfirewall.inputs.LoggingConfigurationLoggingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingConfigurationArgs Empty = new LoggingConfigurationArgs();

    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     * 
     */
    @InputImport(name="firewallArn", required=true)
    private final Input<String> firewallArn;

    public Input<String> getFirewallArn() {
        return this.firewallArn;
    }

    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * 
     */
    @InputImport(name="loggingConfiguration", required=true)
    private final Input<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration;

    public Input<LoggingConfigurationLoggingConfigurationArgs> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public LoggingConfigurationArgs(
        Input<String> firewallArn,
        Input<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration) {
        this.firewallArn = Objects.requireNonNull(firewallArn, "expected parameter 'firewallArn' to be non-null");
        this.loggingConfiguration = Objects.requireNonNull(loggingConfiguration, "expected parameter 'loggingConfiguration' to be non-null");
    }

    private LoggingConfigurationArgs() {
        this.firewallArn = Input.empty();
        this.loggingConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> firewallArn;
        private Input<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallArn = defaults.firewallArn;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
        }

        public Builder setFirewallArn(Input<String> firewallArn) {
            this.firewallArn = Objects.requireNonNull(firewallArn);
            return this;
        }

        public Builder setFirewallArn(String firewallArn) {
            this.firewallArn = Input.of(Objects.requireNonNull(firewallArn));
            return this;
        }

        public Builder setLoggingConfiguration(Input<LoggingConfigurationLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = Objects.requireNonNull(loggingConfiguration);
            return this;
        }

        public Builder setLoggingConfiguration(LoggingConfigurationLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Input.of(Objects.requireNonNull(loggingConfiguration));
            return this;
        }
        public LoggingConfigurationArgs build() {
            return new LoggingConfigurationArgs(firewallArn, loggingConfiguration);
        }
    }
}
