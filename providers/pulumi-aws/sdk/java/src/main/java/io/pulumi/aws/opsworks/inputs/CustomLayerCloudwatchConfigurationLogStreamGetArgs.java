// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomLayerCloudwatchConfigurationLogStreamGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomLayerCloudwatchConfigurationLogStreamGetArgs Empty = new CustomLayerCloudwatchConfigurationLogStreamGetArgs();

    /**
     * Specifies the max number of log events in a batch, up to `10000`. The default value is `1000`.
     * 
     */
    @InputImport(name="batchCount")
    private final @Nullable Input<Integer> batchCount;

    public Input<Integer> getBatchCount() {
        return this.batchCount == null ? Input.empty() : this.batchCount;
    }

    /**
     * Specifies the maximum size of log events in a batch, in bytes, up to `1048576` bytes. The default value is `32768` bytes.
     * 
     */
    @InputImport(name="batchSize")
    private final @Nullable Input<Integer> batchSize;

    public Input<Integer> getBatchSize() {
        return this.batchSize == null ? Input.empty() : this.batchSize;
    }

    /**
     * Specifies the time duration for the batching of log events. The minimum value is `5000` and default value is `5000`.
     * 
     */
    @InputImport(name="bufferDuration")
    private final @Nullable Input<Integer> bufferDuration;

    public Input<Integer> getBufferDuration() {
        return this.bufferDuration == null ? Input.empty() : this.bufferDuration;
    }

    /**
     * Specifies how the timestamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference (https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html).
     * 
     */
    @InputImport(name="datetimeFormat")
    private final @Nullable Input<String> datetimeFormat;

    public Input<String> getDatetimeFormat() {
        return this.datetimeFormat == null ? Input.empty() : this.datetimeFormat;
    }

    /**
     * Specifies the encoding of the log file so that the file can be read correctly. The default is `utf_8`.
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * Specifies log files that you want to push to CloudWatch Logs. File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*).
     * 
     */
    @InputImport(name="file", required=true)
    private final Input<String> file;

    public Input<String> getFile() {
        return this.file;
    }

    /**
     * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as `1`, `2-5`. The default value is `1`.
     * 
     */
    @InputImport(name="fileFingerprintLines")
    private final @Nullable Input<String> fileFingerprintLines;

    public Input<String> getFileFingerprintLines() {
        return this.fileFingerprintLines == null ? Input.empty() : this.fileFingerprintLines;
    }

    /**
     * Specifies where to start to read data (`start_of_file` or `end_of_file`). The default is `start_of_file`.
     * 
     */
    @InputImport(name="initialPosition")
    private final @Nullable Input<String> initialPosition;

    public Input<String> getInitialPosition() {
        return this.initialPosition == null ? Input.empty() : this.initialPosition;
    }

    /**
     * Specifies the destination log group. A log group is created automatically if it doesn't already exist.
     * 
     */
    @InputImport(name="logGroupName", required=true)
    private final Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * Specifies the pattern for identifying the start of a log message.
     * 
     */
    @InputImport(name="multilineStartPattern")
    private final @Nullable Input<String> multilineStartPattern;

    public Input<String> getMultilineStartPattern() {
        return this.multilineStartPattern == null ? Input.empty() : this.multilineStartPattern;
    }

    /**
     * Specifies the time zone of log event time stamps.
     * 
     */
    @InputImport(name="timeZone")
    private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public CustomLayerCloudwatchConfigurationLogStreamGetArgs(
        @Nullable Input<Integer> batchCount,
        @Nullable Input<Integer> batchSize,
        @Nullable Input<Integer> bufferDuration,
        @Nullable Input<String> datetimeFormat,
        @Nullable Input<String> encoding,
        Input<String> file,
        @Nullable Input<String> fileFingerprintLines,
        @Nullable Input<String> initialPosition,
        Input<String> logGroupName,
        @Nullable Input<String> multilineStartPattern,
        @Nullable Input<String> timeZone) {
        this.batchCount = batchCount;
        this.batchSize = batchSize;
        this.bufferDuration = bufferDuration;
        this.datetimeFormat = datetimeFormat;
        this.encoding = encoding;
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.fileFingerprintLines = fileFingerprintLines;
        this.initialPosition = initialPosition;
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.multilineStartPattern = multilineStartPattern;
        this.timeZone = timeZone;
    }

    private CustomLayerCloudwatchConfigurationLogStreamGetArgs() {
        this.batchCount = Input.empty();
        this.batchSize = Input.empty();
        this.bufferDuration = Input.empty();
        this.datetimeFormat = Input.empty();
        this.encoding = Input.empty();
        this.file = Input.empty();
        this.fileFingerprintLines = Input.empty();
        this.initialPosition = Input.empty();
        this.logGroupName = Input.empty();
        this.multilineStartPattern = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLayerCloudwatchConfigurationLogStreamGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> batchCount;
        private @Nullable Input<Integer> batchSize;
        private @Nullable Input<Integer> bufferDuration;
        private @Nullable Input<String> datetimeFormat;
        private @Nullable Input<String> encoding;
        private Input<String> file;
        private @Nullable Input<String> fileFingerprintLines;
        private @Nullable Input<String> initialPosition;
        private Input<String> logGroupName;
        private @Nullable Input<String> multilineStartPattern;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLayerCloudwatchConfigurationLogStreamGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchCount = defaults.batchCount;
    	      this.batchSize = defaults.batchSize;
    	      this.bufferDuration = defaults.bufferDuration;
    	      this.datetimeFormat = defaults.datetimeFormat;
    	      this.encoding = defaults.encoding;
    	      this.file = defaults.file;
    	      this.fileFingerprintLines = defaults.fileFingerprintLines;
    	      this.initialPosition = defaults.initialPosition;
    	      this.logGroupName = defaults.logGroupName;
    	      this.multilineStartPattern = defaults.multilineStartPattern;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setBatchCount(@Nullable Input<Integer> batchCount) {
            this.batchCount = batchCount;
            return this;
        }

        public Builder setBatchCount(@Nullable Integer batchCount) {
            this.batchCount = Input.ofNullable(batchCount);
            return this;
        }

        public Builder setBatchSize(@Nullable Input<Integer> batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setBatchSize(@Nullable Integer batchSize) {
            this.batchSize = Input.ofNullable(batchSize);
            return this;
        }

        public Builder setBufferDuration(@Nullable Input<Integer> bufferDuration) {
            this.bufferDuration = bufferDuration;
            return this;
        }

        public Builder setBufferDuration(@Nullable Integer bufferDuration) {
            this.bufferDuration = Input.ofNullable(bufferDuration);
            return this;
        }

        public Builder setDatetimeFormat(@Nullable Input<String> datetimeFormat) {
            this.datetimeFormat = datetimeFormat;
            return this;
        }

        public Builder setDatetimeFormat(@Nullable String datetimeFormat) {
            this.datetimeFormat = Input.ofNullable(datetimeFormat);
            return this;
        }

        public Builder setEncoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setFile(Input<String> file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setFile(String file) {
            this.file = Input.of(Objects.requireNonNull(file));
            return this;
        }

        public Builder setFileFingerprintLines(@Nullable Input<String> fileFingerprintLines) {
            this.fileFingerprintLines = fileFingerprintLines;
            return this;
        }

        public Builder setFileFingerprintLines(@Nullable String fileFingerprintLines) {
            this.fileFingerprintLines = Input.ofNullable(fileFingerprintLines);
            return this;
        }

        public Builder setInitialPosition(@Nullable Input<String> initialPosition) {
            this.initialPosition = initialPosition;
            return this;
        }

        public Builder setInitialPosition(@Nullable String initialPosition) {
            this.initialPosition = Input.ofNullable(initialPosition);
            return this;
        }

        public Builder setLogGroupName(Input<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Input.of(Objects.requireNonNull(logGroupName));
            return this;
        }

        public Builder setMultilineStartPattern(@Nullable Input<String> multilineStartPattern) {
            this.multilineStartPattern = multilineStartPattern;
            return this;
        }

        public Builder setMultilineStartPattern(@Nullable String multilineStartPattern) {
            this.multilineStartPattern = Input.ofNullable(multilineStartPattern);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public CustomLayerCloudwatchConfigurationLogStreamGetArgs build() {
            return new CustomLayerCloudwatchConfigurationLogStreamGetArgs(batchCount, batchSize, bufferDuration, datetimeFormat, encoding, file, fileFingerprintLines, initialPosition, logGroupName, multilineStartPattern, timeZone);
        }
    }
}
