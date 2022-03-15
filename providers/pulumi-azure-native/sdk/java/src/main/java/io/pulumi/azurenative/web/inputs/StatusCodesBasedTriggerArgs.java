// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger based on status code.
 * 
 */
public final class StatusCodesBasedTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusCodesBasedTriggerArgs Empty = new StatusCodesBasedTriggerArgs();

    /**
     * Request Count.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    /**
     * Request Path
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * HTTP status code.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Integer> status;

    public Output<Integer> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Request Sub Status.
     * 
     */
    @Import(name="subStatus")
      private final @Nullable Output<Integer> subStatus;

    public Output<Integer> getSubStatus() {
        return this.subStatus == null ? Output.empty() : this.subStatus;
    }

    /**
     * Time interval.
     * 
     */
    @Import(name="timeInterval")
      private final @Nullable Output<String> timeInterval;

    public Output<String> getTimeInterval() {
        return this.timeInterval == null ? Output.empty() : this.timeInterval;
    }

    /**
     * Win32 error code.
     * 
     */
    @Import(name="win32Status")
      private final @Nullable Output<Integer> win32Status;

    public Output<Integer> getWin32Status() {
        return this.win32Status == null ? Output.empty() : this.win32Status;
    }

    public StatusCodesBasedTriggerArgs(
        @Nullable Output<Integer> count,
        @Nullable Output<String> path,
        @Nullable Output<Integer> status,
        @Nullable Output<Integer> subStatus,
        @Nullable Output<String> timeInterval,
        @Nullable Output<Integer> win32Status) {
        this.count = count;
        this.path = path;
        this.status = status;
        this.subStatus = subStatus;
        this.timeInterval = timeInterval;
        this.win32Status = win32Status;
    }

    private StatusCodesBasedTriggerArgs() {
        this.count = Output.empty();
        this.path = Output.empty();
        this.status = Output.empty();
        this.subStatus = Output.empty();
        this.timeInterval = Output.empty();
        this.win32Status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;
        private @Nullable Output<String> path;
        private @Nullable Output<Integer> status;
        private @Nullable Output<Integer> subStatus;
        private @Nullable Output<String> timeInterval;
        private @Nullable Output<Integer> win32Status;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesBasedTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
    	      this.timeInterval = defaults.timeInterval;
    	      this.win32Status = defaults.win32Status;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable Integer count) {
            this.count = Output.ofNullable(count);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }

        public Builder status(@Nullable Output<Integer> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Integer status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder subStatus(@Nullable Output<Integer> subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public Builder subStatus(@Nullable Integer subStatus) {
            this.subStatus = Output.ofNullable(subStatus);
            return this;
        }

        public Builder timeInterval(@Nullable Output<String> timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = Output.ofNullable(timeInterval);
            return this;
        }

        public Builder win32Status(@Nullable Output<Integer> win32Status) {
            this.win32Status = win32Status;
            return this;
        }

        public Builder win32Status(@Nullable Integer win32Status) {
            this.win32Status = Output.ofNullable(win32Status);
            return this;
        }
        public StatusCodesBasedTriggerArgs build() {
            return new StatusCodesBasedTriggerArgs(count, path, status, subStatus, timeInterval, win32Status);
        }
    }
}
