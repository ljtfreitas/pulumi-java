// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A ScanRun is a output-only resource representing an actual run of the scan.
 * 
 */
public final class ScanRunResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScanRunResponse Empty = new ScanRunResponse();

    /**
     * The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
     * 
     */
    @InputImport(name="endTime", required=true)
      private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The execution state of the ScanRun.
     * 
     */
    @InputImport(name="executionState", required=true)
      private final String executionState;

    public String getExecutionState() {
        return this.executionState;
    }

    /**
     * Whether the scan run has found any vulnerabilities.
     * 
     */
    @InputImport(name="hasVulnerabilities", required=true)
      private final Boolean hasVulnerabilities;

    public Boolean getHasVulnerabilities() {
        return this.hasVulnerabilities;
    }

    /**
     * The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated by the system.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
     * 
     */
    @InputImport(name="progressPercent", required=true)
      private final Integer progressPercent;

    public Integer getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED".
     * 
     */
    @InputImport(name="resultState", required=true)
      private final String resultState;

    public String getResultState() {
        return this.resultState;
    }

    /**
     * The time at which the ScanRun started.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
     * 
     */
    @InputImport(name="urlsCrawledCount", required=true)
      private final String urlsCrawledCount;

    public String getUrlsCrawledCount() {
        return this.urlsCrawledCount;
    }

    /**
     * The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
     * 
     */
    @InputImport(name="urlsTestedCount", required=true)
      private final String urlsTestedCount;

    public String getUrlsTestedCount() {
        return this.urlsTestedCount;
    }

    public ScanRunResponse(
        String endTime,
        String executionState,
        Boolean hasVulnerabilities,
        String name,
        Integer progressPercent,
        String resultState,
        String startTime,
        String urlsCrawledCount,
        String urlsTestedCount) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.executionState = Objects.requireNonNull(executionState, "expected parameter 'executionState' to be non-null");
        this.hasVulnerabilities = Objects.requireNonNull(hasVulnerabilities, "expected parameter 'hasVulnerabilities' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.progressPercent = Objects.requireNonNull(progressPercent, "expected parameter 'progressPercent' to be non-null");
        this.resultState = Objects.requireNonNull(resultState, "expected parameter 'resultState' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.urlsCrawledCount = Objects.requireNonNull(urlsCrawledCount, "expected parameter 'urlsCrawledCount' to be non-null");
        this.urlsTestedCount = Objects.requireNonNull(urlsTestedCount, "expected parameter 'urlsTestedCount' to be non-null");
    }

    private ScanRunResponse() {
        this.endTime = null;
        this.executionState = null;
        this.hasVulnerabilities = null;
        this.name = null;
        this.progressPercent = null;
        this.resultState = null;
        this.startTime = null;
        this.urlsCrawledCount = null;
        this.urlsTestedCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String executionState;
        private Boolean hasVulnerabilities;
        private String name;
        private Integer progressPercent;
        private String resultState;
        private String startTime;
        private String urlsCrawledCount;
        private String urlsTestedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.executionState = defaults.executionState;
    	      this.hasVulnerabilities = defaults.hasVulnerabilities;
    	      this.name = defaults.name;
    	      this.progressPercent = defaults.progressPercent;
    	      this.resultState = defaults.resultState;
    	      this.startTime = defaults.startTime;
    	      this.urlsCrawledCount = defaults.urlsCrawledCount;
    	      this.urlsTestedCount = defaults.urlsTestedCount;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setExecutionState(String executionState) {
            this.executionState = Objects.requireNonNull(executionState);
            return this;
        }

        public Builder setHasVulnerabilities(Boolean hasVulnerabilities) {
            this.hasVulnerabilities = Objects.requireNonNull(hasVulnerabilities);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProgressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }

        public Builder setResultState(String resultState) {
            this.resultState = Objects.requireNonNull(resultState);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setUrlsCrawledCount(String urlsCrawledCount) {
            this.urlsCrawledCount = Objects.requireNonNull(urlsCrawledCount);
            return this;
        }

        public Builder setUrlsTestedCount(String urlsTestedCount) {
            this.urlsTestedCount = Objects.requireNonNull(urlsTestedCount);
            return this;
        }
        public ScanRunResponse build() {
            return new ScanRunResponse(endTime, executionState, hasVulnerabilities, name, progressPercent, resultState, startTime, urlsCrawledCount, urlsTestedCount);
        }
    }
}
