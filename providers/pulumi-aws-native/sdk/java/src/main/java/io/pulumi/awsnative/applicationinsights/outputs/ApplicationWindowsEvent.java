// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.awsnative.applicationinsights.enums.ApplicationEventLevel;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationWindowsEvent {
    /**
     * The levels of event to log.
     * 
     */
    private final List<ApplicationEventLevel> eventLevels;
    /**
     * The type of Windows Events to log.
     * 
     */
    private final String eventName;
    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    private final String logGroupName;
    /**
     * The name of the log pattern set.
     * 
     */
    private final @Nullable String patternSet;

    @CustomType.Constructor
    private ApplicationWindowsEvent(
        @CustomType.Parameter("eventLevels") List<ApplicationEventLevel> eventLevels,
        @CustomType.Parameter("eventName") String eventName,
        @CustomType.Parameter("logGroupName") String logGroupName,
        @CustomType.Parameter("patternSet") @Nullable String patternSet) {
        this.eventLevels = eventLevels;
        this.eventName = eventName;
        this.logGroupName = logGroupName;
        this.patternSet = patternSet;
    }

    /**
     * The levels of event to log.
     * 
    */
    public List<ApplicationEventLevel> getEventLevels() {
        return this.eventLevels;
    }
    /**
     * The type of Windows Events to log.
     * 
    */
    public String getEventName() {
        return this.eventName;
    }
    /**
     * The CloudWatch log group name to be associated to the monitored log.
     * 
    */
    public String getLogGroupName() {
        return this.logGroupName;
    }
    /**
     * The name of the log pattern set.
     * 
    */
    public Optional<String> getPatternSet() {
        return Optional.ofNullable(this.patternSet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationWindowsEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationEventLevel> eventLevels;
        private String eventName;
        private String logGroupName;
        private @Nullable String patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationWindowsEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLevels = defaults.eventLevels;
    	      this.eventName = defaults.eventName;
    	      this.logGroupName = defaults.logGroupName;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder eventLevels(List<ApplicationEventLevel> eventLevels) {
            this.eventLevels = Objects.requireNonNull(eventLevels);
            return this;
        }

        public Builder eventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }

        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder patternSet(@Nullable String patternSet) {
            this.patternSet = patternSet;
            return this;
        }
        public ApplicationWindowsEvent build() {
            return new ApplicationWindowsEvent(eventLevels, eventName, logGroupName, patternSet);
        }
    }
}
