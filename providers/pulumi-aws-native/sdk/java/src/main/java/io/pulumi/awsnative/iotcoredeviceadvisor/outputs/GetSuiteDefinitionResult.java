// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor.outputs;

import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionConfigurationProperties;
import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSuiteDefinitionResult {
    /**
     * The Amazon Resource name for the suite definition.
     * 
     */
    private final @Nullable String suiteDefinitionArn;
    private final @Nullable SuiteDefinitionConfigurationProperties suiteDefinitionConfiguration;
    /**
     * The unique identifier for the suite definition.
     * 
     */
    private final @Nullable String suiteDefinitionId;
    /**
     * The suite definition version of a test suite.
     * 
     */
    private final @Nullable String suiteDefinitionVersion;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<SuiteDefinitionTag> tags;

    @CustomType.Constructor
    private GetSuiteDefinitionResult(
        @CustomType.Parameter("suiteDefinitionArn") @Nullable String suiteDefinitionArn,
        @CustomType.Parameter("suiteDefinitionConfiguration") @Nullable SuiteDefinitionConfigurationProperties suiteDefinitionConfiguration,
        @CustomType.Parameter("suiteDefinitionId") @Nullable String suiteDefinitionId,
        @CustomType.Parameter("suiteDefinitionVersion") @Nullable String suiteDefinitionVersion,
        @CustomType.Parameter("tags") @Nullable List<SuiteDefinitionTag> tags) {
        this.suiteDefinitionArn = suiteDefinitionArn;
        this.suiteDefinitionConfiguration = suiteDefinitionConfiguration;
        this.suiteDefinitionId = suiteDefinitionId;
        this.suiteDefinitionVersion = suiteDefinitionVersion;
        this.tags = tags;
    }

    /**
     * The Amazon Resource name for the suite definition.
     * 
    */
    public Optional<String> getSuiteDefinitionArn() {
        return Optional.ofNullable(this.suiteDefinitionArn);
    }
    public Optional<SuiteDefinitionConfigurationProperties> getSuiteDefinitionConfiguration() {
        return Optional.ofNullable(this.suiteDefinitionConfiguration);
    }
    /**
     * The unique identifier for the suite definition.
     * 
    */
    public Optional<String> getSuiteDefinitionId() {
        return Optional.ofNullable(this.suiteDefinitionId);
    }
    /**
     * The suite definition version of a test suite.
     * 
    */
    public Optional<String> getSuiteDefinitionVersion() {
        return Optional.ofNullable(this.suiteDefinitionVersion);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<SuiteDefinitionTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSuiteDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String suiteDefinitionArn;
        private @Nullable SuiteDefinitionConfigurationProperties suiteDefinitionConfiguration;
        private @Nullable String suiteDefinitionId;
        private @Nullable String suiteDefinitionVersion;
        private @Nullable List<SuiteDefinitionTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSuiteDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suiteDefinitionArn = defaults.suiteDefinitionArn;
    	      this.suiteDefinitionConfiguration = defaults.suiteDefinitionConfiguration;
    	      this.suiteDefinitionId = defaults.suiteDefinitionId;
    	      this.suiteDefinitionVersion = defaults.suiteDefinitionVersion;
    	      this.tags = defaults.tags;
        }

        public Builder suiteDefinitionArn(@Nullable String suiteDefinitionArn) {
            this.suiteDefinitionArn = suiteDefinitionArn;
            return this;
        }

        public Builder suiteDefinitionConfiguration(@Nullable SuiteDefinitionConfigurationProperties suiteDefinitionConfiguration) {
            this.suiteDefinitionConfiguration = suiteDefinitionConfiguration;
            return this;
        }

        public Builder suiteDefinitionId(@Nullable String suiteDefinitionId) {
            this.suiteDefinitionId = suiteDefinitionId;
            return this;
        }

        public Builder suiteDefinitionVersion(@Nullable String suiteDefinitionVersion) {
            this.suiteDefinitionVersion = suiteDefinitionVersion;
            return this;
        }

        public Builder tags(@Nullable List<SuiteDefinitionTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetSuiteDefinitionResult build() {
            return new GetSuiteDefinitionResult(suiteDefinitionArn, suiteDefinitionConfiguration, suiteDefinitionId, suiteDefinitionVersion, tags);
        }
    }
}
