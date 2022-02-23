// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CrawlerS3TargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CrawlerS3TargetArgs Empty = new CrawlerS3TargetArgs();

    /**
     * The name of the connection to use to connect to the Delta table target.
     * 
     */
    @InputImport(name="connectionName")
    private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * The ARN of the dead-letter SQS queue.
     * 
     */
    @InputImport(name="dlqEventQueueArn")
    private final @Nullable Input<String> dlqEventQueueArn;

    public Input<String> getDlqEventQueueArn() {
        return this.dlqEventQueueArn == null ? Input.empty() : this.dlqEventQueueArn;
    }

    /**
     * The ARN of the SQS queue to receive S3 notifications from.
     * 
     */
    @InputImport(name="eventQueueArn")
    private final @Nullable Input<String> eventQueueArn;

    public Input<String> getEventQueueArn() {
        return this.eventQueueArn == null ? Input.empty() : this.eventQueueArn;
    }

    /**
     * A list of glob patterns used to exclude from the crawl.
     * 
     */
    @InputImport(name="exclusions")
    private final @Nullable Input<List<String>> exclusions;

    public Input<List<String>> getExclusions() {
        return this.exclusions == null ? Input.empty() : this.exclusions;
    }

    /**
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * Sets the number of files in each leaf folder to be crawled when crawling sample files in a dataset. If not set, all the files are crawled. A valid value is an integer between 1 and 249.
     * 
     */
    @InputImport(name="sampleSize")
    private final @Nullable Input<Integer> sampleSize;

    public Input<Integer> getSampleSize() {
        return this.sampleSize == null ? Input.empty() : this.sampleSize;
    }

    public CrawlerS3TargetArgs(
        @Nullable Input<String> connectionName,
        @Nullable Input<String> dlqEventQueueArn,
        @Nullable Input<String> eventQueueArn,
        @Nullable Input<List<String>> exclusions,
        Input<String> path,
        @Nullable Input<Integer> sampleSize) {
        this.connectionName = connectionName;
        this.dlqEventQueueArn = dlqEventQueueArn;
        this.eventQueueArn = eventQueueArn;
        this.exclusions = exclusions;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.sampleSize = sampleSize;
    }

    private CrawlerS3TargetArgs() {
        this.connectionName = Input.empty();
        this.dlqEventQueueArn = Input.empty();
        this.eventQueueArn = Input.empty();
        this.exclusions = Input.empty();
        this.path = Input.empty();
        this.sampleSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrawlerS3TargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionName;
        private @Nullable Input<String> dlqEventQueueArn;
        private @Nullable Input<String> eventQueueArn;
        private @Nullable Input<List<String>> exclusions;
        private Input<String> path;
        private @Nullable Input<Integer> sampleSize;

        public Builder() {
    	      // Empty
        }

        public Builder(CrawlerS3TargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.dlqEventQueueArn = defaults.dlqEventQueueArn;
    	      this.eventQueueArn = defaults.eventQueueArn;
    	      this.exclusions = defaults.exclusions;
    	      this.path = defaults.path;
    	      this.sampleSize = defaults.sampleSize;
        }

        public Builder setConnectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder setConnectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder setDlqEventQueueArn(@Nullable Input<String> dlqEventQueueArn) {
            this.dlqEventQueueArn = dlqEventQueueArn;
            return this;
        }

        public Builder setDlqEventQueueArn(@Nullable String dlqEventQueueArn) {
            this.dlqEventQueueArn = Input.ofNullable(dlqEventQueueArn);
            return this;
        }

        public Builder setEventQueueArn(@Nullable Input<String> eventQueueArn) {
            this.eventQueueArn = eventQueueArn;
            return this;
        }

        public Builder setEventQueueArn(@Nullable String eventQueueArn) {
            this.eventQueueArn = Input.ofNullable(eventQueueArn);
            return this;
        }

        public Builder setExclusions(@Nullable Input<List<String>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setExclusions(@Nullable List<String> exclusions) {
            this.exclusions = Input.ofNullable(exclusions);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setSampleSize(@Nullable Input<Integer> sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }

        public Builder setSampleSize(@Nullable Integer sampleSize) {
            this.sampleSize = Input.ofNullable(sampleSize);
            return this;
        }
        public CrawlerS3TargetArgs build() {
            return new CrawlerS3TargetArgs(connectionName, dlqEventQueueArn, eventQueueArn, exclusions, path, sampleSize);
        }
    }
}
