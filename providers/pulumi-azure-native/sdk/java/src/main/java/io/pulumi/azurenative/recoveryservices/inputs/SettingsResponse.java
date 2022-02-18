// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common settings field for backup management
 * 
 */
public final class SettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SettingsResponse Empty = new SettingsResponse();

    /**
     * Workload compression flag. This has been added so that 'isSqlCompression'
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    @InputImport(name="isCompression")
    private final @Nullable Boolean isCompression;

    public Optional<Boolean> getIsCompression() {
        return this.isCompression == null ? Optional.empty() : Optional.ofNullable(this.isCompression);
    }

    /**
     * SQL compression flag
     * 
     */
    @InputImport(name="issqlcompression")
    private final @Nullable Boolean issqlcompression;

    public Optional<Boolean> getIssqlcompression() {
        return this.issqlcompression == null ? Optional.empty() : Optional.ofNullable(this.issqlcompression);
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @InputImport(name="timeZone")
    private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public SettingsResponse(
        @Nullable Boolean isCompression,
        @Nullable Boolean issqlcompression,
        @Nullable String timeZone) {
        this.isCompression = isCompression;
        this.issqlcompression = issqlcompression;
        this.timeZone = timeZone;
    }

    private SettingsResponse() {
        this.isCompression = null;
        this.issqlcompression = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCompression;
        private @Nullable Boolean issqlcompression;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCompression = defaults.isCompression;
    	      this.issqlcompression = defaults.issqlcompression;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setIsCompression(@Nullable Boolean isCompression) {
            this.isCompression = isCompression;
            return this;
        }

        public Builder setIssqlcompression(@Nullable Boolean issqlcompression) {
            this.issqlcompression = issqlcompression;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public SettingsResponse build() {
            return new SettingsResponse(isCompression, issqlcompression, timeZone);
        }
    }
}
